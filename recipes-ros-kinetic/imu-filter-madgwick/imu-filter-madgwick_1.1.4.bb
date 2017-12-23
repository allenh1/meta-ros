# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs message-filters nodelet pluginlib roscpp sensor-msgs tf2 tf2-geometry-msgs tf2-ros"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/kinetic/imu_filter_madgwick/1.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94511358dd1927ccef21bc171feca96d"
SRC_URI[sha256sum] = "732108744ac4d878934bdf9d84c0690dfe6d9ab0d746f472c2d6278e7c001930"
S = "${WORKDIR}/imu_tools-release-release-kinetic-imu_filter_madgwick-1.1.4-0"

inherit catkin
