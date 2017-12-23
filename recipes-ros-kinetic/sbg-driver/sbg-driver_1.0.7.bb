# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The SBG ROS Driver package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ENSTABretagneRobotics/sbg_ros_driver-release/archive/release/kinetic/sbg_driver/1.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "019a75324b3f43ecbd30e48e4c2c79fb"
SRC_URI[sha256sum] = "c58c2c9f9cec3178ad45b3f88c4f38c4dc1e7d7b49180c3873217d120d9ed7a9"
S = "${WORKDIR}/sbg_ros_driver-release-release-kinetic-sbg_driver-1.0.7-0"

inherit catkin
