# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The actionlib_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=e34203b6fc12e7a135d567f73e5f9aa4"

DEPENDS = "actionlib actionlib_msgs catkin message_generation message_runtime roscpp std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/lunar/actionlib_tutorials/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c62eb2b3ec9265ca6e79ba90fce76317"
SRC_URI[sha256sum] = "3b060785dae27b5af99636cfebe5f72b91ac9a98ab2e2dec977378fbc6ccf4c1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
