# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_gazebo_thermal_camera provides a gazebo plugin that produces simulated th"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo gazebo-plugins libgazebo7-dev roscpp"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/kinetic/hector_gazebo_thermal_camera/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4459b484b73bf6d04953f563eae119d"
SRC_URI[sha256sum] = "59d39335d4e27350c5f0ab79336cb69bddc42b527af4d0803bdc6c6aef2eed7d"
S = "${WORKDIR}/hector_gazebo-release-release-kinetic-hector_gazebo_thermal_camera-0.5.0-0"

inherit catkin
