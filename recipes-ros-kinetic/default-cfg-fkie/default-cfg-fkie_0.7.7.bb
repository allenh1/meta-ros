# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The configuration node loads a given launch configuration and offers services to"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native multimaster-msgs-fkie roslaunch roslib rospy"
SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/kinetic/default_cfg_fkie/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "700406eb0d5ab32e6ed174bcc44c4033"
SRC_URI[sha256sum] = "0e0a40d6fe5dd3454ebb70ff795eddfbc2ca9613e771d6d1e25669f0e5463274"
S = "${WORKDIR}/multimaster_fkie-release-release-kinetic-default_cfg_fkie-0.7.7-0"

inherit catkin
