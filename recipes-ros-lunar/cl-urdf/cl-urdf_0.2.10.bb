# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cl_urdf"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cl-transforms roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_urdf/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4593499224d9c298673e18f25f64c01b"
SRC_URI[sha256sum] = "cb01736b12c0fb941289cdaf06209f59931cf6ad4ab812a1121ed86108b1a7fb"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_urdf-0.2.10-0"

inherit catkin
