# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners,     which use "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin filters laser-geometry message-filters pluginlib roscpp rostest sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_filters-release/archive/release/lunar/laser_filters/1.8.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6a3e7b1a23f28f31b18b823004073a10"
SRC_URI[sha256sum] = "d3c51d029df08cc5a39cb87e834f2699890fa73d1ab9b26afd8ae429aa33a6e7"
S = "${WORKDIR}/laser_filters-release-release-lunar-laser_filters-1.8.5-0"

inherit catkin
