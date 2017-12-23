# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS nodelet for fake Kobuki."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-aggregator geometry-msgs kobuki-description kobuki-msgs nav-msgs nodelet robot-state-publisher roscpp sensor-msgs tf"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_soft-release/archive/release/kinetic/kobuki_softnode/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b9de36d7b1ad166d2110c058c8828c28"
SRC_URI[sha256sum] = "4dfe45f4d62f9c3645046f4ef432126b33477a58ea95d4cee0db1128141be6e7"
S = "${WORKDIR}/kobuki_soft-release-release-kinetic-kobuki_softnode-0.1.3-0"

inherit catkin
