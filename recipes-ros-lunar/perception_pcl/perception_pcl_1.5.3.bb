# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred
  bridge"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=58b54a7768a0082719df4e4f059240b6"

DEPENDS = "catkin pcl_conversions pcl_msgs pcl_ros"
SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/lunar/perception_pcl/1.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0ded8cbf2cb947ae10c49cc9ec0a863"
SRC_URI[sha256sum] = "1e92abd8ae7005d0b5d3625565f97ed2403ffac2dc9332f1835918e6b81e65d2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
