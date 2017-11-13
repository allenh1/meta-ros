# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making device"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native message-filters nodelet roscpp sensor-msgs tf2 tf2-ros tf2-sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/pointcloud_to_laserscan-release/archive/release/lunar/pointcloud_to_laserscan/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "849f4d19281ceb03056606aeee1155de"
SRC_URI[sha256sum] = "9e2ab95aa87eb214a152e233650bdadc2d4188821367b6f852b360f980b3c533"
S = "${WORKDIR}/pointcloud_to_laserscan-release-release-lunar-pointcloud_to_laserscan-1.3.1-0"

inherit catkin
