# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners,
    which use "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "angles catkin filters laser_geometry message_filters pluginlib roscpp rostest sensor_msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_filters-release/archive/release/lunar/laser_filters/1.8.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4cd03dfb907b1fa76a23a594031a34ba"
SRC_URI[sha256sum] = "127e82f26c6e1c93f9058f3976df40a2ca40c5b2c413ca823c893d12846e76ea"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
