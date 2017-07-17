# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the GL dependency for a specific ROS distribution and its Qt v"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=9e69baf7ee95bc8b8899dd4b09fa861e"

DEPENDS = "catkin python-qt5-bindings-gl"
SRC_URI = "https://github.com/ros-gbp/gl_dependency-release/archive/release/lunar/gl_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7975e56a736dd87bd1c4fd58776b1a9"
SRC_URI[sha256sum] = "0c78dcf34e3c49635238b3bec4becaa4d1ddc2469d90adab63929373f6a50428"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
