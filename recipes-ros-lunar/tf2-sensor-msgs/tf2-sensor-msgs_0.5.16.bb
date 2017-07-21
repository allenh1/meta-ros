# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Small lib to transform sensor_msgs with tf. Most notably, PointCloud2"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake-modules eigen python-orocos-kdl rospy sensor-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_sensor_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "61a14db0de32f5ef8c19d626730eb71c"
SRC_URI[sha256sum] = "ade594ef84e712a11631f1228e32b318cf2a8072f015afd166e10e3fda49b464"
S = "${WORKDIR}/geometry2-release-release-lunar-tf2_sensor_msgs-0.5.16-0"

inherit catkin
