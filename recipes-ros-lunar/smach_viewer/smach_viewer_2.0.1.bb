# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach viewer is a GUI that shows the state of hierarchical
    SMACH state m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin graphviz rostest smach_msgs smach_ros wxpython"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/lunar/smach_viewer/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "91f2a85da9f3ab1bd9dc81c8efd6f19d"
SRC_URI[sha256sum] = "1b2e564550ebdc51e1edf5dd9d6c22354c0888875e7ee070c1182e13cb693369"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
