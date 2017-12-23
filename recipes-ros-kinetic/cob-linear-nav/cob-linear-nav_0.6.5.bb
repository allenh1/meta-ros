# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_linear_nav provides a simple navigation instrument driving on a linear path "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib catkin-native cob-srvs geometry-msgs move-base-msgs nav-msgs roscpp tf"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_linear_nav/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8f77adec2752e3bb4b6e7ddfaf328d8b"
SRC_URI[sha256sum] = "28c2f03d57f712db28548e35fe0ab82d3eb467ae0aac5f98c09b88e89af72161"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_linear_nav-0.6.5-0"

inherit catkin
