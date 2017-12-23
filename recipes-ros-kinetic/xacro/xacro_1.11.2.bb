# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Xacro (XML Macros)      Xacro is an XML macro language. With xacro, you can cons"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslaunch roslint"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dcf6304e3ea7cc3956e450fd39e61e55"
SRC_URI[sha256sum] = "1bfcd55a8088d1bd9c43059cb6fe21ec6ac75e7f8651d3e77e53e7da5a48f524"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.11.2-0"

inherit catkin
