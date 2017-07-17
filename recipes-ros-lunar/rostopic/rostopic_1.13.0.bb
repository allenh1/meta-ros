# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rostopic contains the rostopic command-line tool for displaying
    debug inform"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=5e3a038038d98920b3274a337e90a657"

DEPENDS = "catkin genpy rosbag rospy rostest"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rostopic/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83f18609545121183aae600908d55224"
SRC_URI[sha256sum] = "c81961ccdd0723c3b09a96e618ae118d73b17d44139c9599720fdde054db214a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
