# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Parser for Semantic Robot Description Format (SRDF)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules console-bridge liburdfdom-headers-dev libtinyxml urdf urdfdom-py"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.4.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "edf3e4bd9ffbbb37b41195c56068880f"
SRC_URI[sha256sum] = "2f7dfc30af56d54c3ca610f648ab68face2697f3d4e135410b749dae0d5d0d80"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.4.2-1"

inherit catkin
