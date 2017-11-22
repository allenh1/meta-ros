# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Base dependencies and support libraries for ROS.     roslib contains many of the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin python-rospkg rospack"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/roslib/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "088206c59131c682333bf90c43e8a4b2"
SRC_URI[sha256sum] = "c5f7355518c6659a7ca7b4ce44ec6022208f1ddbfd6e4e843f5894d4292ef5f4"
S = "${WORKDIR}/ros-release-release-lunar-roslib-1.14.2-0"

inherit catkin
