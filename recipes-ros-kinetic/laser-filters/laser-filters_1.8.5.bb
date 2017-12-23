# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners,     which use "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native filters laser-geometry message-filters pluginlib roscpp rostest sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_filters-release/archive/release/kinetic/laser_filters/1.8.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "168e68f53eecf672a5c6d872257d1b62"
SRC_URI[sha256sum] = "1fda3b068605b6ce9553eb1d4f050ca8de9656c68a79803f81756b47de6bf05d"
S = "${WORKDIR}/laser_filters-release-release-kinetic-laser_filters-1.8.5-0"

inherit catkin
