# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the GL dependency for a specific ROS distribution and its Qt v"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt5-bindings-gl"
SRC_URI = "https://github.com/ros-gbp/gl_dependency-release/archive/release/kinetic/gl_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cda1b169c8923ef6cbc0e94d2801799c"
SRC_URI[sha256sum] = "e253a8266d014f00b961a089835ba7e13748096f2e2ff5b056ea094b2d80835e"
S = "${WORKDIR}/gl_dependency-release-release-kinetic-gl_dependency-1.1.0-0"

inherit catkin
