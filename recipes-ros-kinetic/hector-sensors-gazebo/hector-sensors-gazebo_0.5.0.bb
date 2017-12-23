# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_sensors_gazebo depends on the necessary plugins for using the sensors fro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-plugins hector-gazebo-plugins hector-sensors-description"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/kinetic/hector_sensors_gazebo/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3acd59b7c7c5058bc492bfea4abb8cc2"
SRC_URI[sha256sum] = "95fdab22204b9dadcd183fee8da7c6a6f920024bef030b9927a3072fcb4524bb"
S = "${WORKDIR}/hector_gazebo-release-release-kinetic-hector_sensors_gazebo-0.5.0-0"

inherit catkin
