# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=273a78776691b883ce2d8b632023e3af"

DEPENDS = "catkin dynamic_reconfigure geometry_msgs message_filters nodelet pluginlib roscpp sensor_msgs tf2 tf2_geometry_msgs tf2_ros"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/lunar/imu_filter_madgwick/1.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f77987c4d68505bdcdf1f4875145cd66"
SRC_URI[sha256sum] = "6b12f5f97466cd420c9fe77b68266436dce1d2b8f4c3a12cc009bf1d250bc280"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
