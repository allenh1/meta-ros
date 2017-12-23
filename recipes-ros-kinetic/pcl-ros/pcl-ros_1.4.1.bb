# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure eigen genmsg libpcl-all-dev libvtk-java message-filters nodelet nodelet-topic-tools pcl-conversions pcl-msgs pluginlib proj rosbag rosconsole roscpp roslib sensor-msgs std-msgs tf tf2-eigen"
SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/kinetic/pcl_ros/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d4bdc1a57f43ef898cf09ff9f1dd010"
SRC_URI[sha256sum] = "50e5b87ccac5c7b2c2afe163f9e9987bcc73209260c7392f6a3c9cddd5aae913"
S = "${WORKDIR}/perception_pcl-release-release-kinetic-pcl_ros-1.4.1-0"

inherit catkin
