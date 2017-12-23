# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r)"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master catkin-native catkin class-loader"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_402/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dfc8ffd1529f938e235fec38fa5cff9b"
SRC_URI[sha256sum] = "ee89d547b3c45110cd7fca96fedc2cd9ad1b2ef371945dcc14fc1277dc6fdb99"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_402-0.7.6-0"

inherit catkin
