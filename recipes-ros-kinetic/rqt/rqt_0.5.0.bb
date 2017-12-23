# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt is a Qt-based framework for GUI development for ROS. It consists of three pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rqt-gui rqt-gui-cpp rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "72d71a4b3013392115c2b62b1d313e35"
SRC_URI[sha256sum] = "af64e2e1fafd9744f59cb8c9db459dc63c02fa8cf2e20a1a33342d11abbb5144"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.5.0-0"

inherit catkin
