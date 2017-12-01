# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Allows multipoint communication between rosserial      nodes connected to an xbe"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-serial rospy rosserial-msgs rosserial-python"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_xbee/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da1938e376157717bb7d6dfeec3e4b5b"
SRC_URI[sha256sum] = "8a1a5b166064ca6ef3a2340468cd2e36598bf4dba63387a2d93582fe1415b920"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_xbee-0.7.7-0"

inherit catkin
