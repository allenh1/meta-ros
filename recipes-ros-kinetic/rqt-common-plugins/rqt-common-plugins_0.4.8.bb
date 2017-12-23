# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_common_plugins metapackage provides ROS backend graphical tools suite that c"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rqt-action rqt-bag rqt-bag-plugins rqt-console rqt-dep rqt-graph rqt-image-view rqt-launch rqt-logger-level rqt-msg rqt-plot rqt-publisher rqt-py-common rqt-py-console rqt-reconfigure rqt-service-caller rqt-shell rqt-srv rqt-top rqt-topic rqt-web"
SRC_URI = "https://github.com/ros-gbp/rqt_common_plugins-release/archive/release/kinetic/rqt_common_plugins/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4b9be3f947b317df96878e536f945f9e"
SRC_URI[sha256sum] = "a13b1827d40b38442e56d9fda372cc2538828711657ec6db3476878252cba673"
S = "${WORKDIR}/rqt_common_plugins-release-release-kinetic-rqt_common_plugins-0.4.8-0"

inherit catkin
