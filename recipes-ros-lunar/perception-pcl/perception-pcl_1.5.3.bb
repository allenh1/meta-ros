# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin pcl-conversions pcl-msgs pcl-ros"
SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/lunar/perception_pcl/1.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0ded8cbf2cb947ae10c49cc9ec0a863"
SRC_URI[sha256sum] = "1e92abd8ae7005d0b5d3625565f97ed2403ffac2dc9332f1835918e6b81e65d2"
S = "${WORKDIR}/perception_pcl-release-release-lunar-perception_pcl-1.5.3-0"

inherit catkin
