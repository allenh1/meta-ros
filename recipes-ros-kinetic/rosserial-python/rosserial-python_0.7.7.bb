# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python-based implementation of the rosserial protocol."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-serial rospy rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_python/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b45f58701597e561b825739f481ad652"
SRC_URI[sha256sum] = "f05a2b8500926c6066f925e87d71d94d5b4951a94399dc1015e97ef85e5130ce"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_python-0.7.7-0"

inherit catkin
