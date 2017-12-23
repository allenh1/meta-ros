# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud mess"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native filters laser-geometry message-filters message-generation message-runtime pluginlib roscpp rostest sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_assembler-release/archive/release/kinetic/laser_assembler/1.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bcd95e75ea2807b9f3973b69582cc9c8"
SRC_URI[sha256sum] = "b5eabbf6cf82af173cdd42834c62bc9382dfc1ffc77d669da5f3b59735ffd3c3"
S = "${WORKDIR}/laser_assembler-release-release-kinetic-laser_assembler-1.7.4-0"

inherit catkin
