# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS device driver for Velodyne 3D LIDARs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater dynamic-reconfigure libpcap nodelet pluginlib roscpp roslaunch rostest tf velodyne-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/kinetic/velodyne_driver/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8de53fb18d30b12298edece4fa26135d"
SRC_URI[sha256sum] = "386481fd4e87d64c228969e22f7bbefb0fa4472851908fd1ca269249715628ff"
S = "${WORKDIR}/velodyne-release-release-kinetic-velodyne_driver-1.3.0-0"

inherit catkin
