# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extensions for slime to assist in working with ROS packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "public_domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c60c465e235b13ecfc23607d3b1b9e2f"

DEPENDS = "catkin-native rosemacs roslisp sbcl slime-wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/kinetic/slime_ros/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "91ec47cfba162ba3e99bf40777ee172e"
SRC_URI[sha256sum] = "903ef23286a499db9d606310682dc567f91562840c3862eb55bc25f88cf6e5de"
S = "${WORKDIR}/ros_emacs_utils-release-release-kinetic-slime_ros-0.4.11-0"

inherit catkin
