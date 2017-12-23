# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the WebKit dependency for a specific ROS distribution and its "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt5-bindings-webkit"
SRC_URI = "https://github.com/ros-gbp/webkit_dependency-release/archive/release/kinetic/webkit_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e73a5cd3d968021ff05b22ce03d42986"
SRC_URI[sha256sum] = "5e90166cb40c736e14bcd5e97c99c90a038c787474e2678c5ea390d7e883c451"
S = "${WORKDIR}/webkit_dependency-release-release-kinetic-webkit_dependency-1.1.0-0"

inherit catkin
