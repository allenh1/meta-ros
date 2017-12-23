# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS driver for miscellaneous sensors on NAO.     Python bindings for camera, son"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=25;endline=25;md5=775f835d6d0cb09aa9b18a80dac33ee4"

DEPENDS = "boost camera-info-manager camera-info-manager-py catkin-native dynamic-reconfigure naoqi-driver-py octomap octomap-msgs rospy sensor-msgs"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge-release/archive/release/kinetic/naoqi_sensors_py/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "adc72e3383685fd4e5ce75c134b32b98"
SRC_URI[sha256sum] = "7aaa45e944e3dc066d942c9b66e961a3282691e0c83f53c9d5a4709edfaca1a0"
S = "${WORKDIR}/naoqi_bridge-release-release-kinetic-naoqi_sensors_py-0.5.5-0"

inherit catkin
