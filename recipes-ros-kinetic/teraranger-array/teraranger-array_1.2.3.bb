# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teraranger_array package for TeraRanger Array Products (Multiflex, One)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs message-generation message-runtime roscpp rospy sensor-msgs serial std-msgs"
SRC_URI = "https://github.com/Terabee/teraranger_array-release/archive/release/kinetic/teraranger_array/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0e2df5f3ea77711e5ac133c2e5288022"
SRC_URI[sha256sum] = "4fa0b75f9b6141873e4f357aeaaa7358a97bfae1dbe1ce1ff2dbcd39ab9f802a"
S = "${WORKDIR}/teraranger_array-release-release-kinetic-teraranger_array-1.2.3-0"

inherit catkin
