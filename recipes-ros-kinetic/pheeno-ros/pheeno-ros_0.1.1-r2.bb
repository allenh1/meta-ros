# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pheeno_ros package contains necessary files for run and control an individua"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs roscpp rospy std-msgs"
SRC_URI = "https://github.com/ACSLaboratory/pheeno_ros-release/archive/release/kinetic/pheeno_ros/0.1.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7423b76cdc2101f83751762ed71a4f23"
SRC_URI[sha256sum] = "a46103efe5ccba8dab313e093fa1b970392c11bd6bf94e10d1131e85dc94a1ed"
S = "${WORKDIR}/pheeno_ros-release-release-kinetic-pheeno_ros-0.1.1-2"

inherit catkin
