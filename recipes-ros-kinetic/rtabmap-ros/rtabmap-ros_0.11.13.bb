# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RTAB-Map's ros-pkg. RTAB-Map is a RGB-D SLAM approach with real-time constraints"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native class-loader costmap-2d cv-bridge dynamic-reconfigure eigen-conversions genmsg geometry-msgs image-geometry image-transport image-transport-plugins laser-geometry libpcl-all-dev message-filters move-base-msgs nav-msgs nodelet octomap-ros pcl-conversions pcl-ros roscpp rospy rtabmap rviz sensor-msgs std-msgs std-srvs stereo-msgs tf tf2-ros tf-conversions visualization-msgs"
SRC_URI = "https://github.com/introlab/rtabmap_ros-release/archive/release/kinetic/rtabmap_ros/0.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32a0d373e0b5db05d05cb91015801ed2"
SRC_URI[sha256sum] = "13bb2a1040adfa82cb8a096bf372cf9184a86309f91acc552b066ed9f4d2db4e"
S = "${WORKDIR}/rtabmap_ros-release-release-kinetic-rtabmap_ros-0.11.13-0"

inherit catkin
