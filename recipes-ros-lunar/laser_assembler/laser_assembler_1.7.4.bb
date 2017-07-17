# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud mess"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=ad4c8520318af842956100a607cd814a"

DEPENDS = "catkin filters laser_geometry message_filters message_generation message_runtime pluginlib roscpp rostest sensor_msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_assembler-release/archive/release/lunar/laser_assembler/1.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ec90ec1ecade192b08143dbe4cdb454"
SRC_URI[sha256sum] = "8caa3924c6a926d5baab4adeb575763012b8cd2f2dda456a8458b645afbf0930"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
