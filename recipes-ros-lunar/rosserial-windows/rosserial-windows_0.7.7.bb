# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for Windows platforms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-runtime nav-msgs rospy rosserial-client rosserial-msgs sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_windows/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de37c7e50ecb03de67a72495cc860568"
SRC_URI[sha256sum] = "4f5c3e1e67d8e643fee1b6bc9844f7e3d1864e5b4e9177d99e0ae6f6829a3e05"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_windows-0.7.7-0"

inherit catkin
