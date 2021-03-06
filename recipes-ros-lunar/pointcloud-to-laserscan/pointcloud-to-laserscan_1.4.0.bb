# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making device"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native catkin message-filters nodelet roscpp sensor-msgs tf2 tf2-ros tf2-sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/pointcloud_to_laserscan-release/archive/release/lunar/pointcloud_to_laserscan/1.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "163c527f3c4d78ad0f51292ae8d7fdb9"
SRC_URI[sha256sum] = "5a7e44aa3523ec2b39676688fb91d6c0e2cf3ec57f633ce2b672b8a181cc0713"
S = "${WORKDIR}/pointcloud_to_laserscan-release-release-lunar-pointcloud_to_laserscan-1.4.0-0"

inherit catkin
