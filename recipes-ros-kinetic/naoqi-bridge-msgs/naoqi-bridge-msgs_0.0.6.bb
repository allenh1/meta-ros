# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The naoqi_bridge_msgs package provides custom messages for running Aldebaran's r"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "actionlib-msgs catkin-native genmsg geometry-msgs message-generation message-runtime nav-msgs sensor-msgs std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge_msgs-release/archive/release/kinetic/naoqi_bridge_msgs/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f2c2311729abf77bbf33deae4f683cc5"
SRC_URI[sha256sum] = "7479bb1e2c8f98befcce9cce0380b0d3dad6387bcb537ab1cfa84d8a47e56c2f"
S = "${WORKDIR}/naoqi_bridge_msgs-release-release-kinetic-naoqi_bridge_msgs-0.0.6-0"

inherit catkin
