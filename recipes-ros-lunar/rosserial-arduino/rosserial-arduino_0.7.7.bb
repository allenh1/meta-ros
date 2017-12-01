# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for Arduino/AVR platforms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "arduino-core catkin-native message-generation message-runtime rospy rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_arduino/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e8bee9f472bc780fb98f564da426881f"
SRC_URI[sha256sum] = "835f665bbf49915c51a74fae81a649941afaed46ef7b8465a81caf84ed309e51"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_arduino-0.7.7-0"

inherit catkin
