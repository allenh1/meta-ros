# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command to print aggregated diagnostic contents to the command line"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic-msgs rospy"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/rosdiagnostic/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d63382785921872ec65c367d66fa32b1"
SRC_URI[sha256sum] = "010d5caed5cf54ddd26be3c22a5616e4a59832176a15ed2bac6ea16cb656aff9"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
