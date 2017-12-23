# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkin macros to allow using pure python packages in usual catkin workspaces wit"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python python-pip"
SRC_URI = "https://github.com/pyros-dev/catkin_pip-release/archive/release/kinetic/catkin_pip/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb06d815139b19707e25c984f0db44f3"
SRC_URI[sha256sum] = "ed04c92382ede02d8098c828a7bd474d1ce96c3a4f78edb61966e7a9850033be"
S = "${WORKDIR}/catkin_pip-release-release-kinetic-catkin_pip-0.2.3-0"

inherit catkin
