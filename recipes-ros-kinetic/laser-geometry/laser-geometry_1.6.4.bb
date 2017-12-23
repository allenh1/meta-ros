# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles boost catkin-native cmake-modules eigen python-numpy roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_geometry-release/archive/release/kinetic/laser_geometry/1.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1f0128a062bfe7a9d3046832f0cc6aa3"
SRC_URI[sha256sum] = "6f825d298f84cc46f325f39d408f9f7710c2de01d26191dbbd902d84b6687734"
S = "${WORKDIR}/laser_geometry-release-release-kinetic-laser_geometry-1.6.4-0"

inherit catkin
