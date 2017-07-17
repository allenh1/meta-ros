# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "stereo_msgs contains messages specific to stereo processing, such as disparity i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin message_generation message_runtime sensor_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/stereo_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c66b7060f07b8f2cfb7c1e1932d52ce"
SRC_URI[sha256sum] = "bdb98c355418a6eb93a6fb2365b7303fb50cc32b29f653a5ac66653684c104dd"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
