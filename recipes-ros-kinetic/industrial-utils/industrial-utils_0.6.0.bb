# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Industrial utils is a library package that captures common funcitonality for the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp urdf"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_utils/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1c566e1a6584c538b553f841994760d7"
SRC_URI[sha256sum] = "dd012c60363c366436e84bf484f0c44a408c33a76345fda6a7e684cb3edc5556"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_utils-0.6.0-0"

inherit catkin
