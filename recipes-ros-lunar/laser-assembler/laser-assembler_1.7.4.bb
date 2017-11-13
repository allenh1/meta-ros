# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud mess"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native filters laser-geometry message-filters message-generation message-runtime pluginlib roscpp rostest sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_assembler-release/archive/release/lunar/laser_assembler/1.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ec90ec1ecade192b08143dbe4cdb454"
SRC_URI[sha256sum] = "8caa3924c6a926d5baab4adeb575763012b8cd2f2dda456a8458b645afbf0930"
S = "${WORKDIR}/laser_assembler-release-release-lunar-laser_assembler-1.7.4-0"

inherit catkin
