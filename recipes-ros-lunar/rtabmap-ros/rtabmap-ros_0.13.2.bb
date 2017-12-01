# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RTAB-Map's ros-pkg. RTAB-Map is a RGB-D SLAM approach with real-time constraints"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native class-loader compressed-depth-image-transport compressed-image-transport costmap-2d cv-bridge dynamic-reconfigure eigen-conversions genmsg geometry-msgs image-geometry image-transport laser-geometry libpcl-all-dev message-filters move-base-msgs nav-msgs nodelet octomap-ros pcl-conversions pcl-ros roscpp rospy rtabmap rviz sensor-msgs std-msgs std-srvs stereo-msgs tf tf2-ros tf-conversions visualization-msgs"
SRC_URI = "https://github.com/introlab/rtabmap_ros-release/archive/release/lunar/rtabmap_ros/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3bc9d7b788ce63ec5c6ec6a3ce7d8a38"
SRC_URI[sha256sum] = "7c526a283a659f7d3245cfc156c7efcf442f5486dd0d48d8442c1591389906f1"
S = "${WORKDIR}/rtabmap_ros-release-release-lunar-rtabmap_ros-0.13.2-0"

inherit catkin
