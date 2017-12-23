# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-commander moveit-ros-planning roscpp roslang"
SRC_URI = "https://github.com/start-jsk/denso-release/archive/release/kinetic/${PN}/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "22f91995982325e0d7a39784c3e13ac9"
SRC_URI[sha256sum] = "35a0da3dc35cf849b7b5f7c1a0f7a52418a90f1b0c524b879dcd5f5168409c85"
S = "${WORKDIR}/denso-release-release-kinetic-${PN}-2.0.2-0"

inherit catkin
