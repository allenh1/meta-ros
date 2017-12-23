# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the GL dependency for a specific ROS distribution and its Qt v"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-qt5-bindings-gl"
SRC_URI = "https://github.com/ros-gbp/gl_dependency-release/archive/release/lunar/gl_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7975e56a736dd87bd1c4fd58776b1a9"
SRC_URI[sha256sum] = "0c78dcf34e3c49635238b3bec4becaa4d1ddc2469d90adab63929373f6a50428"
S = "${WORKDIR}/gl_dependency-release-release-lunar-gl_dependency-1.1.0-0"

inherit catkin
