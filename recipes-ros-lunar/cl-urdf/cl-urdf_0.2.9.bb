# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cl_urdf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-transforms roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_urdf/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e10969391f863f8560715c7cc38272c"
SRC_URI[sha256sum] = "5d319b6aa3935b4a5bd57b3f1237bfac33e666a4df9f9d853c52cdf44250563b"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_urdf-0.2.9-0"

inherit catkin
