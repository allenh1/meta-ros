# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred
  bridge"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=6ccf55250b6ac8167e3af78fd1ebb3b8"

DEPENDS = "catkin cmake_modules dynamic_reconfigure eigen genmsg libpcl-all-dev libvtk-java message_filters nodelet nodelet_topic_tools pcl_conversions pcl_msgs pluginlib proj qtbase5-dev rosbag rosconsole roscpp roslib sensor_msgs std_msgs tf tf2_eigen"
SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/lunar/pcl_ros/1.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99647d222c34a412d96a432164987541"
SRC_URI[sha256sum] = "7c0c1140335b2ced45f9074120ff2dc9eae0f12619a4fa07573292f33284b332"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
