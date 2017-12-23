# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package that adds the depth camera to Romeo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge naoqi-sensors-py rospy"
SRC_URI = "https://github.com/ros-aldebaran/romeo_robot-release/archive/release/kinetic/romeo_sensors_py/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "067eff31df1d1f6c35aa15b87d67e516"
SRC_URI[sha256sum] = "fbf33f29191c5afaf2b1f177b95c1762f39031a1feab5f5881fb787a7afdb2f5"
S = "${WORKDIR}/romeo_robot-release-release-kinetic-romeo_sensors_py-0.1.5-0"

inherit catkin
